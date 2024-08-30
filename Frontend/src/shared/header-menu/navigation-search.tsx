import { SearchIcon } from "../icons/search";
import { OpenSearchIcon } from "../icons/open-search";

export const NavigationSearch = () => {
    return (
        <div className="header-search">
            <input className="header-search__input" type="text" placeholder="Search apparel, figures, and more" />
                <button className="header-search__open">
                    <OpenSearchIcon />
                </button>
                <button className="header-search__submit" type="submit">
                    <SearchIcon />
                </button>
        </div>
    )
}