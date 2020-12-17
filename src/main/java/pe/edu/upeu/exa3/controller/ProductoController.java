package pe.edu.upeu.exa3.controller;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.exa3.service.ProductoService;
@RestController
@CrossOrigin(origins = "", allowedHeaders = "")
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;
    @GetMapping("/all")
    public Map<String, Object> readAll(){
        return productoService.readAll();
    }
}