import React from 'react';
import { LikeIcon } from '../icons/like';
import { CartIcon } from '../icons/cart';

export const NavigationUser: React.FC = () => {
    return (
        <div className='navigation-user__panel'>
            <LikeIcon />
            <CartIcon />
        </div>
    );
};
