package martian_genome_interface_lab;

/**
 * @Description:
 * @Title: GeniusDector
 * @Package martian_genome.detectors
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/18/23 10:23 AM
 */
public class GeniusDector implements PatternDetector{

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        return analyzer.findSimpleSequence("GAGA");
    }

    @Override
    public String labelString() {
        return "Genius";
    }

    @Override
    public String additionalInfo() {
        return "GeniusDector additional information: ";
    }
}
