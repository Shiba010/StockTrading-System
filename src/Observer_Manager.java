/*
 * Observer_User.java
 * by Kevin Lin (lin2391@bu.edu)
 * 20APR2023
 *
 * This interface is used to update listeners
 * when the user is updated
 */

public interface Observer_Manager {
    public void update(Manager m);
    public void register(Manager m);
}