package p07EnvironmentAbstraction.p1profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile(value = "test")
public class BeanTwo {
}
