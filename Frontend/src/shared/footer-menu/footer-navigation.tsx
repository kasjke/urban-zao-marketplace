import React from 'react';
import { Link } from 'react-router-dom';

export const FooterNavigation: React.FC = () => {
    const currentYear: number = new Date().getFullYear();
    return (
        <div className="footer-navigation">
            <div className="footer-navigation__wrapper">
                <div>
                    <h4>Customer service</h4>
                    <ul>
                        <li>
                            <Link to="/contact" className="footer-navigation__link">Contact Us</Link>
                        </li>
                        <li>
                            <Link to="/delayed-preorders" className="footer-navigation__link ">
                                <span>Delayed Pre-Orders List</span>
                            </Link>
                        </li>
                        <li>
                            <Link to="/sezzle" className="footer-navigation__link">Sezzle</Link>
                        </li>
                        <li>
                            <Link to="/shipping-returns" className="footer-navigation__link">Shipping & Returns</Link>
                        </li>
                        <li>
                            <Link to="/faq" className="footer-navigation__link">FAQ</Link>
                        </li>
                    </ul>
                </div>
                <div>
                    <h4>About Urban Zen</h4>
                    <ul>
                        <li>
                            <Link to="/about-us" className="footer-navigation__link">About Us</Link>
                        </li>
                        <li>
                            <Link to="/copyright-policy" className="footer-navigation__link">Copyright Policy</Link>
                        </li>
                        <li>
                            <Link to="/privacy-policy" className="footer-navigation__link">Privacy Policy</Link>
                        </li>
                        <li>
                            <Link to="/terms-of-service" className="footer-navigation__link">Terms of Service</Link>
                        </li>
                        <li>
                            <Link to="/do-not-sell" className="footer-navigation__link">Do Not Sell My Personal Information</Link>
                        </li>
                    </ul>
                </div>
                <div>
                    <h4>Helpful links</h4>
                    <ul>
                        <li>
                            <Link to="/sign-in" className="footer-navigation__link">Sign In</Link>
                        </li>
                        <li>
                            <Link to="/sales-promotions" className="footer-navigation__link">Sales & Promotions Details</Link>
                        </li>
                        <li>
                            <div className="footer-navigation__btn-wrapper">
                                <Link to="/login-as-seller" className='footer-navigation__btn'>log in as seller</Link>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
            <p className="footer-navigation__copyright">
                Copyright &#169; {currentYear}, Urban Zen
            </p>
        </div>
    );
};
