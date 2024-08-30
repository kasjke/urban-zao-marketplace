import React from 'react';
import { UserIcon } from '../icons/user';

export const NavigationSignin: React.FC = () => {
  return (
    <div className='navigation-user'>
        <div className='navigation-user__user'>
            <UserIcon />
        </div>
        <div className='navigation-user__signin'>
            <a className='navigation-user__link' href="#">Sign In</a>
            <span>/</span>
            <a className='navigation-user__link' href="#">Register</a>
        </div>
    </div>
  );
};
  