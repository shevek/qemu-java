/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuKeyboardOption extends AbstractQEmuOption {

    public static enum Layout {

        ar("ar"),
        da("da"),
        de("de"),
        de_ch("de-ch"),
        en_gb("en-gb"),
        en_us("en-us"),
        es("es"),
        et("et"),
        fi("fi"),
        fo("fo"),
        fr("fr"),
        fr_be("fr-be"),
        fr_ca("fr-ca"),
        fr_ch("fr-ch"),
        hr("hr"),
        hu("hu"),
        is("is"),
        it("it"),
        ja("ja"),
        lt("lt"),
        lv("lv"),
        mk("mk"),
        nl("nl"),
        nl_be("nl-be"),
        no("no"),
        pl("pl"),
        pt("pt"),
        pt_br("pt-br"),
        ru("ru"),
        sl("sl"),
        sv("sv"),
        th("th"),
        tr("tr");
        private final String layoutName;

        private Layout(String layoutName) {
            this.layoutName = layoutName;
        }

        @Nonnull
        public String getLayoutName() {
            return layoutName;
        }

        @Override
        public String toString() {
            return name() + "(" + getLayoutName() + ")";
        }
    }
    private final Layout layout;

    public QEmuKeyboardOption(@Nonnull Layout layout) {
        this.layout = layout;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-k", layout.getLayoutName());
    }
}
