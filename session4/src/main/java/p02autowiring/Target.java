package p02autowiring;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Target {
    private BeanOne beanOne;
    @NonNull
    private BeanTwo beanTwo;
    @NonNull
    private  BeanThree beanThree;
}
