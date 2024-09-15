package org.gustavotbett.exercicio2;

public class LegacyToClientAdapter extends ClientRectangle {
    private LegacyRectangle legacyRectangle;

    public LegacyToClientAdapter(LegacyRectangle legacyRectangle, long width, long height) {
        super(width, height);
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void displayRectangle() {
        long x1 = 0;
        long y1 = 0;
        long x2 = super.getWidth();
        long y2 = super.getHeight();

        legacyRectangle.draw(x1, y1, x2, y2);
    }
}
