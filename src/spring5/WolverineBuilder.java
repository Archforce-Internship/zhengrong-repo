package spring5;

/**
 * @author 517
 * @date 2021-03-02 - 19:58
 */
public class WolverineBuilder implements XManBuilder {

    XMan mXMan;

    WolverineBuilder() {
        mXMan = new XMan();
    }

    // need to consider

   /* @Override
    public WolverineBuilder buildXFactor() {
        mXMan.setxFactor("claw");
        System.out.println(mXMan.getxFactor());
        return this;
    }*/

    @Override
    public XManBuilder buildXFactor() {
        mXMan.setxFactor("claw");
        System.out.println(mXMan.getxFactor());
        return this;
    }

    @Override
    public WolverineBuilder buildLover() {
        mXMan.setLover("Jane");
        System.out.println(mXMan.getLover());
        return this;
    }

    @Override
    public WolverineBuilder buildName() {
        mXMan.setName("Wali");
        System.out.println(mXMan.getName());
        return this;
    }

    @Override
    public WolverineBuilder buildAge() {
        mXMan.setAge(18);
        System.out.println(mXMan.getAge());
        return this;
    }

    @Override
    public XMan buildXman() {
        System.out.println("Wolverine is successfully built");
        return mXMan;
    }

}
