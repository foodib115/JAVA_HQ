package edu.KevinChen.advancedjava.assignment1;


import edu.KevinChen.advancedjava.assignment1.Slingshot;
import junit.framework.TestCase;

/**
 * Junit Test for slingshot class
 *
 * @author Kevin Chen
  */

public class SlingshotTest extends TestCase {

    private String ammoType;
    private Integer ammoQuantity;

    public void setup() {
        ammoType = "Rocks";
        ammoQuantity = 50;
    }

    public void testSlingshot() {
        Slingshot slingshot = new Slingshot(ammoType, ammoQuantity);

        assertEquals("The ammo type is set", slingshot.getAmmoType(), ammoType);
        assertEquals("The ammo quantity is set", slingshot.getAmmoQuantity(), ammoQuantity);

    }

    public void testShootSlingShot() {
        Slingshot slingshot = new Slingshot(ammoType, ammoQuantity);
        Integer afterShot = ammoQuantity - 1;
        slingshot.shootSlingShot();

        assertEquals("Ammo is deducted correctly", slingshot.getAmmoQuantity(), afterShot);

    }

    public void testReloadSlingShot() {
        Slingshot slingshot = new Slingshot(ammoType, ammoQuantity);
        Integer afterReload = ammoQuantity + 5;
        slingshot.reloadSlingShot(5);

        assertEquals("Ammo is added correctly", slingshot.getAmmoQuantity(), afterReload);
    }

}