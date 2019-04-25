package Application;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
public class Controller {
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
	
	@RequestMapping(value = "/helloXml", produces = { "application/json" },method = RequestMethod.POST)
	public String receiveXMLPayload(@RequestBody Flower flower) throws JsonProcessingException {
	
		ObjectMapper xmlMapper = new ObjectMapper();
		String xml = xmlMapper.writeValueAsString(flower);
		return xml;
	}
	
	@RequestMapping(value = "/extractJson", produces = { "application/json" }, method = RequestMethod.POST)
	public String receivePayload(@RequestBody Flower flower) throws IOException {
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonNode rootNode = mapper.readTree(mapper.writeValueAsBytes(flower));
		
		JsonNode newNode = null;
		
		//((ObjectNode) newNode).putArray(((ObjectNode) rootNode).get("address").toString());
		//((ObjectNode) newNode).put
		
		//((ObjectNode) rootNode).remove("name");

		//((ObjectNode) rootNode).remove("street");
		
		//((ObjectNode) rootNode).remove("address");
		
		
		JsonNode addressNode = ((ObjectNode) rootNode).remove("address");
		
		
		String output = addressNode.toString();
		
		return output;
		
	}

}
