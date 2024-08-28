import { BrowserRouter, Routes, Route } from "react-router-dom";
import { Header } from "../shared/header";
import { Footer } from "../shared/footer";
import { MainPage } from "../pages/main/main-page";

export const AppRoutes: React.FC = () => {
    return (
        <BrowserRouter> 
            <Header />            
            <Routes>
                <Route path="/" element={<MainPage />} />
            </Routes>
            <Footer />
        </BrowserRouter>
    );
};
