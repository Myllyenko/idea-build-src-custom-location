package demo;

public class Foo
{
    public Foo()
    {
        new bar.ClassThatMustBeVisibleInBuildSrc();
    }
}
