package p01EnvironmentAbstraction.p1profiles.p1xml.school;

import p01EnvironmentAbstraction.p1profiles.p1xml.C01Food;
import p01EnvironmentAbstraction.p1profiles.p1xml.FoodProviderService;

import java.util.Arrays;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<C01Food> provideLunchSet() {
        return Arrays.asList(
                new C01Food("sib"),
                new C01Food("piaz")
        );
    }
}
