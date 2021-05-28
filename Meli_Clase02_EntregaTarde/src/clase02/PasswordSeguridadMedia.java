package clase02;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordSeguridadMedia extends Password
{
    public PasswordSeguridadMedia(String value)
    {
        super(value);
    }

    @Override
    protected boolean validarPasword(String password) {
        Pattern pat = Pattern.compile("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,16}$");
        Matcher mat = pat.matcher(password);

        if (mat.matches())
        {
            return true;
        }
        else
        {
            throw new PasswordException(password + ", No es una contraseña de seguridad media, debe tener al entre 8 y 16 caracteres, al menos un dígito, " +
                    "al menos una minúscula y al menos una mayúscula. " +
                    "Puede tener otros símbolos.");
        }
    }
}
