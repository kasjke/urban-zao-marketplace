import { SearchIcon } from "../icons/search";
import { OpenSearchIcon } from "../icons/open-search";

export const NavigationSearch = () => {
    return (
        <div>
            <form>
                <button>
                    <OpenSearchIcon />
                </button>
                <input type="text" placeholder="Search apparel, figures, and more" />
                <button type="submit">
                    <SearchIcon />
                </button>
            </form>
        </div>
    )
}