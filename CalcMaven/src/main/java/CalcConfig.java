import io.confluent.rest.RestConfig;
import org.apache.kafka.common.config.ConfigDef;

import java.util.Map;

public class CalcConfig extends RestConfig{
  private static final ConfigDef config;

  static {
    config = baseConfigDef();
  }

  //This might be ok to only call super(config)
  public CalcConfig(Map<String, String> props){
    super(config, props);
  }
}
