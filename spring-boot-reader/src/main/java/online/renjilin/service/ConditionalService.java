package online.renjilin.service;

import online.renjilin.conditional.TestConditional;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(TestConditional.class)
public class ConditionalService {
}
