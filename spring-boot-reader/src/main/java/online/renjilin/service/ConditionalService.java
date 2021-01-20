package online.renjilin.service;

import online.renjilin.conditional.TestConditional;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnSingleCandidate(TestConditional.class)
//@ConditionalOnWebApplication
@ConditionalOnNotWebApplication
public class ConditionalService {
}
