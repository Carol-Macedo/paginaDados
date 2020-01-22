package siteDed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping
    public String mostrarHome(){
        return "<h1>Welcome!</h1>" +
                " <a href=\"iniciar\">iniciar</a>";
    }

    @GetMapping("/iniciar")
    public String paginaInicial(){
        return "  <h2>Vamos Lá</h2>" +
                "<form action=\"resultado\">\n" +
                "<input type=\"Lados\">\n" +
                "<input type=\"Vezes\">\n" +
                "<button>Jogar</button>\n" +
                "</form>";
    }
    @GetMapping("/resultado")
    public String resultado(){
        return "<h1> O resultado é: 100  <h1> ";
    }

}

