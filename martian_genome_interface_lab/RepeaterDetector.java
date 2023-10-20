package martian_genome_interface_lab;

/**
 * @Description:
 * @Title: RepeaterDetector
 * @Package martian_genome.dectors
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/18/23 10:29 AM
 */
public class RepeaterDetector implements PatternDetector {

    private String pattern;

    public RepeaterDetector() {
    }

    public RepeaterDetector(int count, String s) {
        StringBuilder sb = new StringBuilder();
        while (count > 0) {
            sb.append(s);
            count--;
        }
        pattern = sb.toString();
    }


    @Override
    public int detect(GenomeAnalyzer analyzer) {
        return analyzer.findSimpleSequence(pattern);
    }

    @Override
    public String labelString() {
        return "Repeated " + pattern;
    }

    @Override
    public String additionalInfo() {
        return "RepeaterDetector additional information: ";
    }
}
