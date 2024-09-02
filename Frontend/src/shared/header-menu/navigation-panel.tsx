import React from 'react';
import { Link } from 'react-router-dom';
import { NavigationSearch } from './navigation-search';
import { NavigationSignin } from './navigation-signin';


export const NavigationPanel: React.FC = () => {
  return (
    <>
      <div className="navigation-panel__promoline">
        <p className='container'>New Items on sale | UP TO %50 OFF</p>
      </div>
      <div className="navigation-panel__topline"></div>
      <div className="navigation-panel">
        <div className='container navigation-panel__container'>
          <div className="header-logo">
            <Link to="/" className="header-logo__link">Urban Zen</Link>
          </div>
          <NavigationSearch />
          <NavigationSignin />
        </div>
      </div>
    </>
  );
};
