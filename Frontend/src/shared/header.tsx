import React from 'react';
import { NavigationMenu } from './header-menu/navigation-menu';
import { NavigationPanel } from './header-menu/navigation-panel';

export const Header: React.FC = () => {
  return (
    <div>
      <NavigationPanel />
      <NavigationMenu />
    </div>
  );
};
