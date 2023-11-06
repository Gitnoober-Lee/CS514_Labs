package martian_genome_abstract_lab;

/**
 * @Description:
 * @Title: GastroDiseaseDetector
 * @Package martian_genome_abstract_lab
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/23/23 10:23 AM
 */
public class GastroDiseaseDetector extends PatternDetector {

    @Override
    public int detect(String buffer) {
        if (buffer.length() < 3) {
            return -1;
        }
        for (int i = 0; i < buffer.length(); i++) {
            if (buffer.charAt(i) == 'G') {
                int j = i + 1;
                while ((j < buffer.length() - 2) && (buffer.charAt(j) == 'T')) {
                    j++;
                }
                // if ((buffer.charAt(j) == 'G') && (sb.length() > 1)) {
                if ((buffer.charAt(j + 1) == 'G') && (j + 1 == buffer.length() - 1)) {
                    return i;
                } else {
                    i = j + 2;
                }
            }
        }
        return -1;
    }

    @Override
    public String labelString() {
        return null;
    }
}
