package clase02;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSeguridadAlta extends Password
{
    public PasswordSeguridadAlta(String value)
    {
        super(value);
    }

    @Override
    protected boolean validarPasword(String password) {

        Pattern pat = Pattern.compile("^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$");
        Matcher mat = pat.matcher(password);

        if (mat.matches())
        {
            return true;
        }
        else
        {
            throw new PasswordException(password + ", No es una contraseña de seguridad alta, debe tener al entre 8 y 16 caracteres, al menos un dígito, " +
                    " al menos una minúscula, al menos una " +
                    " mayúscula y al menos un caracter no alfanumérico.");
        }
    }
}
