import io.confluent.rest.Application;
import io.confluent.rest.RestConfigException;
import org.eclipse.jetty.security.AbstractLoginService;
import org.eclipse.jetty.security.ConstraintMapping;
import org.eclipse.jetty.security.IdentityService;
import org.eclipse.jetty.security.LoginService;
import org.eclipse.jetty.util.security.Constraint;
import org.eclipse.jetty.util.security.Password;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.core.Configurable;
import java.util.HashMap;

public class CalculatorApp extends Application<CalcConfig> {

  public static void main(String[] args) {

    System.out.println("Hello world!");
  }
}