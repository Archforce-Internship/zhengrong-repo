package spring5;

/**
 * @author 517
 * @date 2021-03-02 - 20:00
 */
public class WolverineDirector {

    public XMan constructWolverine(WolverineBuilder wolverineBuilder) {
        return wolverineBuilder
                .buildXFactor()
                .buildLover()
                .buildName()
                .buildAge()
                .buildXman();
    }
}
