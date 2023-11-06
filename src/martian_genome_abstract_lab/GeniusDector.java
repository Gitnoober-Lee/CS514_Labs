package martian_genome_abstract_lab;

/**
 * @Description:
 * @Title: GeniusDector
 * @Package martian_genome_abstract_lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/23/23 10:22 AM
 */
public class GeniusDector extends PatternDetector {

    @Override
    public int detect(String buffer) {
        return buffer.indexOf("GAGA");
    }

    @Override
    public String labelString() {
        return null;
    }
}
