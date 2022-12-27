package p01EnvironmentAbstraction.p1profiles.p2annotation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "dev")
public class BeanThree {
}
