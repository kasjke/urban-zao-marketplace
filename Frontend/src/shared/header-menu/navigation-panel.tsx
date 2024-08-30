import React from 'react';
import { NavigationSearch } from './navigation-search';
import { NavigationSignin } from './navigation-signin';

export const NavigationPanel: React.FC = () => {
  return (
    <>
      <div className="navigation-panel__promoline">
        <p>New Items on sale | UP TO %50 OFF</p>
      </div>
      <div className="navigation-panel__topline"></div>
      <div className="navigation-panel">
        <div className="header-logo">
          <a href="/" className="header-logo__link">Urban Zen</a>
        </div>
        <NavigationSearch />
        <NavigationSignin />
      </div>
    </>
  );
};
