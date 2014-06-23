/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.binding.hue.internal.service;

import nl.q42.jue.FullLight;
import nl.q42.jue.HueBridge;
import nl.q42.jue.Light;

/**
 * The {@link LightStatusListener} is notified when a light status has changed or a light has been removed or added.
 * 
 * @author Oliver Libutzki - Initial contribution
 *
 */
public interface LightStatusListener {

    /**
     * This method is called whenever the state of the given light has changed. The new state can be obtained by {@link FullLight#getState()}.
     * @param bridge The bridge the changed light is connected to.
     * @param light The light which received the state update.
     */
    public void onLightStateChanged(HueBridge bridge, FullLight light);

    /**
     * This method us called whenever a light is removed.
     * @param bridge The bridge the removed light was connected to.
     * @param light The light which is removed.
     */
    public void onLightRemoved(HueBridge bridge, Light light);

    /**
     * This method us called whenever a light is added.
     * @param bridge The bridge the added light was connected to.
     * @param light The light which is added.
     */
    public void onLightAdded(HueBridge bridge, Light light);

}
