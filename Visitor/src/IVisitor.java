import java.util.jar.JarEntry;

public interface IVisitor {
    public double visit(Tank tankItem);
    public double visit(Jet jetItem);
    public double visit(Helicopter heliItem);
}
