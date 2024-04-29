//package br.com.my.church.mychurch;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@CrossOrigin(origins = "*")
//@RestController
//@RequestMapping(value = "/api")
//@Api(value = "API REST STI Usuario")
//public class UsuarioApi {
//
//	@ApiOperation(value = "Busca a lista de usuários cadastrados")
//	@GetMapping("/buscar-todos")
//	public ResponseEntity<List<String>> getAll() {
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Teste");
//		list.add("Teste 2");
//		list.add("Teste 3");
//		list.add("Teste 4");
//		return new ResponseEntity<>(list, HttpStatus.OK);
//	}
//
//}
