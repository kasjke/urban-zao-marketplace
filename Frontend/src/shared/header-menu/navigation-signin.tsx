import React from 'react';
import { Link } from 'react-router-dom';
import { UserIcon } from '../icons/user';
import { NavigationUser } from './navigation-user-panel';

export const NavigationSignin: React.FC = () => {
  return (
    <div className='navigation-user'>
        <div className='navigation-user__user'>
            <UserIcon />
        </div>
        <div className='navigation-user__signin'>
            <Link className='navigation-user__link' to="/signin">Sign In</Link>
            <span>/</span>
            <Link className='navigation-user__link' to="/register">Register</Link>
        </div>
        <NavigationUser />
    </div>
  );
};
