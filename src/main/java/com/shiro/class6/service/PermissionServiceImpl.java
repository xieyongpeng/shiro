package com.shiro.class6.service;

import com.shiro.class6.bean.Permission;
import com.shiro.class6.dao.PermissionDao;
import com.shiro.class6.dao.PermissionDaoImpl;



/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-1-28
 * <p>Version: 1.0
 */
public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao = new PermissionDaoImpl();

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
