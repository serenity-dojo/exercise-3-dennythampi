package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteFood = "Bone";
        int age = 5;

        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);
    }

}
