package martian_genome_interface_lab;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description:
 * @Title: GastroDiseaseDetector
 * @Package martian_genome.dectors
 * @Author: lijunpeng@cmhi.chinamobile.com
 * @CreateTime: 10/18/23 10:28 AM
 */
public class GastroDiseaseDetector implements PatternDetector {

    private String regex = "[G][T]+[G]";

    // @Override
    // public int detect(GenomeAnalyzer analyzer) {
    //     String buffer = analyzer.getBuffer();
    //     Pattern pattern = Pattern.compile(regex);
    //     Matcher matcher = pattern.matcher(buffer);
    //     if (matcher.matches()){
    //         return matcher.start();
    //     } else {
    //         return -1;
    //     }
    // }

    public static void main(String[] args) {
        String buffer = "GTG";
        StringBuilder sb;
        for (int i = 0; i < buffer.length(); i++) {
            if (buffer.charAt(i) == 'G') {
                sb = new StringBuilder("G");
                int j = i + 1;
                while ((j < (buffer.length() - 1)) && (buffer.charAt(j) == 'T')) {
                    sb.append('T');
                    j++;
                }
                if ((sb.length() > 1) && (buffer.charAt(j) == 'G')) {
                    sb.append('G');
                    System.out.println(sb.toString());
                    break;
                } else {
                    System.out.println(-1);
                }
            }
        }
    }

    // @Override
    // public int detect(GenomeAnalyzer analyzer) {
    //     String buffer = analyzer.getBuffer();
    //     if (buffer.length() < 3) {
    //         return -1;
    //     }
    //     for (int i = 0; i < buffer.length() - 2; i++) {
    //         if (buffer.charAt(i) == 'G' && buffer.charAt(i + 1) == 'T') {
    //             for (int j = i + 2; j < buffer.length(); j++) {
    //                 if (buffer.charAt(j) != 'T' && buffer.charAt(j) != 'G') {
    //                     i = j + 1;
    //                     break;
    //                 } else if (buffer.charAt(j) == 'G') {
    //                     return i;
    //                 }
    //             }
    //         }
    //     }
    //     return -1;
    // }

    @Override
    public int detect(GenomeAnalyzer analyzer) {
        String buffer = analyzer.getBuffer();
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
        return "GastroDisease";
    }

    @Override
    public String additionalInfo() {
        return "GastroDiseaseDetector additional information: ";
    }
}
