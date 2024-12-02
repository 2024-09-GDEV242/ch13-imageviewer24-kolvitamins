import java.awt.Color;

/**
 * An image filter to make a Andy Warhol inspired collage. The original image is made 1/4 its size and 3 copies are
 * made, each with their own respective R,G,B tint.
 * 
 * @author Jeff Kolvites
 * @version 11/26/24
 */
public class WarholFilter extends Filter
{
    /**
     * Constructor for objects of class WarholFilter.
     * @param name The name of the filter.
     */
    public WarholFilter(String name)
    {
        super(name);
    }

    /**
     * Apply this filter to an image.
     * 
     * @param  image  The image to be changed by this filter.
     */
    public void apply(OFImage image)
    {
        int height = image.getHeight();
        int width = image.getWidth();
        
        int newHeight = image.getHeight() / 2;
        int newWidth = image.getWidth() / 2;
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                image.setPixel(newWidth, newHeight, 
            }
        }
        
        
    }
}
