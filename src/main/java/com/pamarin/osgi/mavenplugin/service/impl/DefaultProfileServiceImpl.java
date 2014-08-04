/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pamarin.osgi.mavenplugin.service.impl;

import com.pamarin.osgi.mavenplugin.service.ProfileService;

/**
 *
 * @author anonymous
 */
public class DefaultProfileServiceImpl implements ProfileService {

    @Override
    public String getName() {
        return "default";
    }

}
