import static java.lang.Math.ceil;
/**
 * @author Mahmoud Chaaban 101217387.
 */

/* Creates PaintJob class attributes  */
public class PaintJob {
    public int numCans;
    public float coatCost,paintNeeded ;
    private String projectName;
    private Float height, width, length, area, budget, canPrice;
    private final float LITER_COVERS_SQUARE_FEET = 100.0f;

    /**
    * Initialize all attributes of PaintJob class to zeros or nulls depending on their type (int,float,String).
    */
    public PaintJob(){
        numCans = 0;
        coatCost = 0.0f;
        paintNeeded = 0.0f;
        projectName = null;
        height = 0.0f;
        width = 0.0f;
        length = 0.0f;
        area = 0.0f;
        budget = 0.0f;
        canPrice = 0.0f;
    }

    /**
     Creates a new PaintJob object with the specified parameters.
     @param projectName the name of the project
     @param height the height of the wall
     @param width the width of the wall
     @param length the length of the wall
     */
    public PaintJob(String projectName, float height, float width, float length ){
        this.projectName = projectName;
        this.height = height;
        this.width = width;
        this.length = length;
        area = 2.0f *  ((height * width) + (height * length));
        numCans = 0;
        coatCost = 0.0f;
        paintNeeded = 0.0f;
        budget = 0.0f;
        canPrice = 0.0f;
    }
    /**
     * Sets the project name.
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    /**
     * Gets the project name.
     */
    public String getProjectName() {
        return projectName;
    }
    /**
     * Sets the height of the wall.
     */
    public void setHeight(Float height) {
        this.height = height;
    }
    /**
     * Gets the height of the wall.
     */
    public Float getHeight() {
        return height;
    }
    /**
     * Sets the width of the wall.
     */
    public void setWidth(Float width) {
        this.width = width;
    }
    /**
     * Gets the width of the wall.
     */
    public Float getWidth() {
        return width;
    }
    /**
     * Sets the length of the wall.
     */
    public void setLength(Float length) {
        this.length = length;
    }
    /**
     * Gets the length of the wall.
     */
    public Float getLength() {
        return length;
    }
    /**
     * Sets the area of the wall.
     */
    public void setArea(Float area) {
        this.area = area;
    }
    /**
     * Gets the area of the wall.
     */
    public Float getArea() {
        return 2.0f *  ((height * width) + (height * length));
    }
    /**
     * Sets the budget for the project.
     */
    public void setBudget(Float budget) {
        this.budget = budget;
    }
    /**
     * Gets the budget for the project.
     */
    public Float getBudget() {
        return budget;
    }
    /**
     * Sets the price of a can of paint.
     */
    public void setCanPrice(Float canPrice) {
        this.canPrice = canPrice;
    }
    /**
     * Gets the price of a can of paint.
     */
    public Float getCanPrice() {
        return canPrice;
    }
    /**
     * Sets the price of a can of paint needed.
     */
    public void setPaintNeeded(float paintNeeded){
        this.paintNeeded = paintNeeded;
    }
    /**
     * Gets the price of a can of paint needed.
     */
    public float getPaintNeeded(){
        return getArea() / LITER_COVERS_SQUARE_FEET;
    }
    /**
     * Sets the price of numbers of cans.
     */
    public void setNumCans(int numCans){
        this.numCans = numCans;
    }
    /**
     * Gets the price of numbers of cans.
     */
    public int getNumCans(){
        return (int) ceil(getPaintNeeded()/ 3.7f);
    }
    /**
     * Sets the price of a coat cost
     */
    public void setCoatCost(float coatCost){
        this.coatCost = coatCost;
    }
    /**
     * Gets the price of a coat cost
     */
    public float getCoatCost(){
        return getNumCans() * getCanPrice();
    }
}
