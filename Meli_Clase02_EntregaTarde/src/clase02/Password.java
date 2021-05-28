package clase02;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password
{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value){
        if(validarPasword(value))
        {
            this.value = value;
        }
    }

    /*
    *El constructor utiliza setValue, para no validar
    * nuevamente si la contraseña es valida, reutiliza el codigo
    * */
    public Password(String value)
    {
        this.setValue(value);
    }


    protected abstract boolean validarPasword(String password);

}
