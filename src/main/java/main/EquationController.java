package main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EquationController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public int[] getVars (){
        return ABXCVar.getVarsArr();
    }

}
