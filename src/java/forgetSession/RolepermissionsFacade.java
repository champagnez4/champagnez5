/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forgetSession;

import forget.Rolepermissions;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Artistcrazy
 */
@Stateless
public class RolepermissionsFacade extends AbstractFacade<Rolepermissions> {

    @PersistenceContext(unitName = "champagnez5PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public RolepermissionsFacade() {
        super(Rolepermissions.class);
    }
    
}