package principal;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import java.lang.Thread;
import javax.swing.JOptionPane;
public class reprodutor {
    public static void principal(String a) throws InterruptedException
    {
        String toLowerCase = a.toLowerCase();
        //programa
        char[] b = toLowerCase.toCharArray();
        
        int i;
        
        for(i = 0; i < a.length(); i++)
        {
            if(b[i] != 'a' && b[i] != 'b' && b[i] != 'c' && b[i] != 'd' && b[i] != 'e' && b[i] != 'f' && b[i] != 'g' && b[i] != 'h' && b[i] != 'i' && b[i] != 'j' && b[i] != 'k' && b[i] != 'l' && b[i] != 'm' && b[i] != 'n' && b[i] != 'o' && b[i] != 'p' && b[i] != 'q' && b[i] != 'r' && b[i] != 's' && b[i] != 't' && b[i] != 'u' && b[i] != 'w' && b[i] != 'x' && b[i] != 'y' && b[i] != 'z')
                b[i] = 'a';
        
            String x =
                String.format("%c.wav", b[i]);
            URL url = Música.class.getResource(x);
            AudioClip audio = Applet.newAudioClip(url);
            audio.play();
            Thread.sleep(500);
            audio.stop();
        }
        //fim
    }
    /*
        a = dó              s = Cm p2
        b = re transversal  t = D#m p2
        c = re              u = Dm p2
        d = la transversal  v = Em p2
        e = mi              w = F#m p2
        f = fa              x = Fm p2
        g = la# pian2       y = G#m p2
        h = sol             z = Gm p2
        i = Am pian2        r = Am p3
        j = la              q = Bm p3
        k = Bm pian2        p = Cm p3
        l = si              o = Dm p3
        m = C#m pian2       n = do8
    */
}
