/**
 * Component scanning isn't turned on by default.
 * This configuration class is minimally configured to make this possible.
 * The @ComponentScan annotation enables component scanning in Spring.
 */

package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CDPlayerConfig {
}
