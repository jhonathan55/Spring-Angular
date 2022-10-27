package com.ejer.demo.exception;

public class ResourcenotFoundException extends RuntimeException  {
   private static final long serialVersionUID = 1L;
   private String resourceName;
    private String fieldName;
    private Long id;
    public ResourcenotFoundException(String resourceName, String fieldName, Long id) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, id));
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.id = id;
    }
    public String getResourceName() {
        return resourceName;
    }
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    public String getFieldName() {
        return fieldName;
    }
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
