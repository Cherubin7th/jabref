package org.jabref.gui.fieldeditors;

import org.jabref.gui.externalfiletype.ExternalFileTypes;
import org.jabref.model.entry.LinkedFile;

import de.jensd.fx.glyphs.GlyphIcons;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIcon;

public class LinkedFileViewModel extends AbstractEditorViewModel {
    private final LinkedFile linkedFile;

    public LinkedFileViewModel(LinkedFile linkedFile) {
        this.linkedFile = linkedFile;
    }

    public LinkedFile getFile() {
        return linkedFile;
    }

    public String getLink() {
        return linkedFile.getLink();
    }

    public String getDescription() {
        return linkedFile.getDescription();
    }

    /**
     * TODO: Be a bit smarter and try to infer correct icon, for example using {@link
     * ExternalFileTypes#getExternalFileTypeByName(String)}
     */
    public GlyphIcons getTypeIcon() {
        return MaterialDesignIcon.FILE_PDF;
    }
}
