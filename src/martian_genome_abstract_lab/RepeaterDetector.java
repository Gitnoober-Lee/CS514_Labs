package martian_genome_abstract_lab;

import martian_genome_interface_lab.GenomeAnalyzer;

/**
 * @Description:
 * @Title: RepeaterDetector
 * @Package martian_genome_abstract_lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/23/23 10:23 AM
 */
public class RepeaterDetector extends PatternDetector{

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
    public int detect(String buffer) {
        return (buffer.indexOf(pattern));
    }

    @Override
    public String labelString() {
        return null;
    }
}
