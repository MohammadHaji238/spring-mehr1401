package p07EnvironmentAbstraction.p1profiles.pr.kindergarten;

import p07EnvironmentAbstraction.p1profiles.pr.C01Food;
import p07EnvironmentAbstraction.p1profiles.pr.FoodProviderService;

import java.util.Arrays;
import java.util.List;

public class FoodProviderServiceImpl implements FoodProviderService {
    @Override
    public List<C01Food> provideLunchSet() {
        return Arrays.asList(
                new C01Food("portegal"),
                new C01Food("narengi")
        );
    }
}
