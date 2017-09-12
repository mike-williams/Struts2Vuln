package com.ambersail.struts2.action;

import com.ambersail.model.Shape;
import com.opensymphony.xwork2.ModelDriven;

public class ShapeController implements ModelDriven<Shape> {

    private Shape shape;

    public ShapeController() {
        this.shape = new Shape();

        this.shape.colour = "red";
        this.shape.type = "circle";
        this.shape.description = "round";
    }

    // Handles /orders/{id} GET requests
    public HttpHeaders show() {
        model = orderManager.findOrder(id);
        return new DefaultHttpHeaders("show").withETag(model.getUniqueStamp()).lastModified(model.getLastModified());
    }


    @Override
    public Shape getModel() {
        return this.shape;
    }

}