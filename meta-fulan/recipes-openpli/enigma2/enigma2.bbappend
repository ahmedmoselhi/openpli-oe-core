CXXFLAGS_append_sh4 += " -std=c++11 -fPIC -fno-strict-aliasing "

DEPENDS_append_sh4 += "\
	libmme-image libmme-host \
	"

RDEPENDS_${PN}_append_sh4 += "\
	libmme-host \
	alsa-utils-amixer-conf \
	"
<<<<<<< HEAD

SRC_URI_sh4 = "${GITHUB_URI}/ahmedmoselhi/openpli-enigma2-sh4.git;branch=follow_oe"
=======
EXTRA_OECONF_append_sh4 += "\
	--enable-${MACHINE} --with-lcd \
        "
SRC_URI_sh4 = "${GITHUB_URI}/kueken/openpli-enigma2.git;branch=follow_oe_vfd"
>>>>>>> parent of d3074f09... Revert "build with vfd"
